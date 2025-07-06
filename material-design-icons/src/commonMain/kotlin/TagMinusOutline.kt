package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagMinusOutline: ImageVector
    get() {
        if (_TagMinusOutline != null) {
            return _TagMinusOutline!!
        }
        _TagMinusOutline = ImageVector.Builder(
            name = "TagMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5f)
                curveTo(5.67f, 5f, 5f, 5.67f, 5f, 6.5f)
                reflectiveCurveTo(5.67f, 8f, 6.5f, 8f)
                reflectiveCurveTo(8f, 7.33f, 8f, 6.5f)
                reflectiveCurveTo(7.33f, 5f, 6.5f, 5f)
                moveTo(6.5f, 5f)
                curveTo(5.67f, 5f, 5f, 5.67f, 5f, 6.5f)
                reflectiveCurveTo(5.67f, 8f, 6.5f, 8f)
                reflectiveCurveTo(8f, 7.33f, 8f, 6.5f)
                reflectiveCurveTo(7.33f, 5f, 6.5f, 5f)
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.04f, 2.21f, 11.53f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.53f, 2.21f, 12.04f, 2.59f, 12.42f)
                lineTo(3f, 12.82f)
                curveTo(3.64f, 12.44f, 4.35f, 12.19f, 5.08f, 12.08f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                lineTo(20f, 13f)
                lineTo(13f, 20f)
                lineTo(11.92f, 18.92f)
                curveTo(11.82f, 19.66f, 11.56f, 20.36f, 11.18f, 21f)
                lineTo(11.59f, 21.41f)
                curveTo(11.96f, 21.79f, 12.47f, 22f, 13f, 22f)
                curveTo(13.53f, 22f, 14.04f, 21.79f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.79f, 14.04f, 22f, 13.53f, 22f, 13f)
                curveTo(22f, 12.47f, 21.79f, 11.96f, 21.41f, 11.58f)
                moveTo(6.5f, 5f)
                curveTo(5.67f, 5f, 5f, 5.67f, 5f, 6.5f)
                reflectiveCurveTo(5.67f, 8f, 6.5f, 8f)
                reflectiveCurveTo(8f, 7.33f, 8f, 6.5f)
                reflectiveCurveTo(7.33f, 5f, 6.5f, 5f)
                moveTo(10f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _TagMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagMinusOutline: ImageVector? = null
