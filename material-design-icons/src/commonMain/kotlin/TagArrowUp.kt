package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagArrowUp: ImageVector
    get() {
        if (_TagArrowUp != null) {
            return _TagArrowUp!!
        }
        _TagArrowUp = ImageVector.Builder(
            name = "TagArrowUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.04f, 2.21f, 11.53f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.53f, 2.21f, 12.04f, 2.59f, 12.41f)
                lineTo(3f, 12.81f)
                curveTo(3.9f, 12.27f, 4.94f, 12f, 6f, 12f)
                curveTo(9.31f, 12f, 12f, 14.69f, 12f, 18f)
                curveTo(12f, 19.06f, 11.72f, 20.09f, 11.18f, 21f)
                lineTo(11.58f, 21.4f)
                curveTo(11.95f, 21.78f, 12.47f, 22f, 13f, 22f)
                reflectiveCurveTo(14.04f, 21.79f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.79f, 14.04f, 22f, 13.53f, 22f, 13f)
                reflectiveCurveTo(21.79f, 11.96f, 21.41f, 11.58f)
                moveTo(5.5f, 7f)
                curveTo(4.67f, 7f, 4f, 6.33f, 4f, 5.5f)
                reflectiveCurveTo(4.67f, 4f, 5.5f, 4f)
                reflectiveCurveTo(7f, 4.67f, 7f, 5.5f)
                reflectiveCurveTo(6.33f, 7f, 5.5f, 7f)
                moveTo(5f, 17f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                lineTo(6f, 14f)
                lineTo(3f, 17f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _TagArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _TagArrowUp: ImageVector? = null
