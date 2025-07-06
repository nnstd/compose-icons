package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.QualityLow: ImageVector
    get() {
        if (_QualityLow != null) {
            return _QualityLow!!
        }
        _QualityLow = ImageVector.Builder(
            name = "QualityLow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                moveTo(18f, 14f)
                curveTo(18f, 14.6f, 17.6f, 15f, 17f, 15f)
                horizontalLineTo(16.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.75f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                curveTo(13.4f, 15f, 13f, 14.6f, 13f, 14f)
                verticalLineTo(10f)
                curveTo(13f, 9.4f, 13.4f, 9f, 14f, 9f)
                horizontalLineTo(17f)
                curveTo(17.6f, 9f, 18f, 9.4f, 18f, 10f)
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                moveTo(11f, 13.5f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _QualityLow!!
    }

@Suppress("ObjectPropertyName")
private var _QualityLow: ImageVector? = null
