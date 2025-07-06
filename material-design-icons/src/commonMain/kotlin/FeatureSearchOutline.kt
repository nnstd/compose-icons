package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FeatureSearchOutline: ImageVector
    get() {
        if (_FeatureSearchOutline != null) {
            return _FeatureSearchOutline!!
        }
        _FeatureSearchOutline = ImageVector.Builder(
            name = "FeatureSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 2f)
                curveTo(13f, 2f, 11f, 4f, 11f, 6.5f)
                curveTo(11f, 9f, 13f, 11f, 15.5f, 11f)
                curveTo(16.4f, 11f, 17.2f, 10.7f, 17.9f, 10.3f)
                lineTo(21f, 13.4f)
                lineTo(22.4f, 12f)
                lineTo(19.3f, 8.9f)
                curveTo(19.7f, 8.2f, 20f, 7.4f, 20f, 6.5f)
                curveTo(20f, 4f, 18f, 2f, 15.5f, 2f)
                moveTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(15f)
                lineTo(18f, 13f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(9.03f)
                curveTo(9.09f, 5.3f, 9.26f, 4.65f, 9.5f, 4f)
                horizontalLineTo(4f)
                moveTo(15.5f, 4f)
                curveTo(16.9f, 4f, 18f, 5.1f, 18f, 6.5f)
                curveTo(18f, 7.9f, 16.9f, 9f, 15.5f, 9f)
                curveTo(14.1f, 9f, 13f, 7.9f, 13f, 6.5f)
                curveTo(13f, 5.1f, 14.1f, 4f, 15.5f, 4f)
                close()
            }
        }.build()

        return _FeatureSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FeatureSearchOutline: ImageVector? = null
