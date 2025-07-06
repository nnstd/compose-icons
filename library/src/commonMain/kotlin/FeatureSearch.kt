package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FeatureSearch: ImageVector
    get() {
        if (_FeatureSearch != null) {
            return _FeatureSearch!!
        }
        _FeatureSearch = ImageVector.Builder(
            name = "FeatureSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(9.5f)
                curveTo(9.2f, 4.8f, 9f, 5.6f, 9f, 6.5f)
                curveTo(9f, 10.1f, 11.9f, 13f, 15.5f, 13f)
                curveTo(16.3f, 13f, 17f, 12.9f, 17.6f, 12.6f)
                lineTo(20f, 15f)
                verticalLineTo(20f)
                moveTo(19.3f, 8.9f)
                curveTo(19.7f, 8.2f, 20f, 7.4f, 20f, 6.5f)
                curveTo(20f, 4f, 18f, 2f, 15.5f, 2f)
                curveTo(13f, 2f, 11f, 4f, 11f, 6.5f)
                curveTo(11f, 9f, 13f, 11f, 15.5f, 11f)
                curveTo(16.4f, 11f, 17.2f, 10.7f, 17.9f, 10.3f)
                lineTo(21f, 13.4f)
                lineTo(22.4f, 12f)
                lineTo(19.3f, 8.9f)
                moveTo(15.5f, 9f)
                curveTo(14.1f, 9f, 13f, 7.9f, 13f, 6.5f)
                curveTo(13f, 5.1f, 14.1f, 4f, 15.5f, 4f)
                curveTo(16.9f, 4f, 18f, 5.1f, 18f, 6.5f)
                curveTo(18f, 7.9f, 16.9f, 9f, 15.5f, 9f)
                close()
            }
        }.build()

        return _FeatureSearch!!
    }

@Suppress("ObjectPropertyName")
private var _FeatureSearch: ImageVector? = null
