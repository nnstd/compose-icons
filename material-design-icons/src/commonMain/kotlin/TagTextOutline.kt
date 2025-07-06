package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagTextOutline: ImageVector
    get() {
        if (_TagTextOutline != null) {
            return _TagTextOutline!!
        }
        _TagTextOutline = ImageVector.Builder(
            name = "TagTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.4f, 11.6f)
                lineTo(12.4f, 2.6f)
                curveTo(12f, 2.2f, 11.5f, 2f, 11f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(11f)
                curveTo(2f, 11.5f, 2.2f, 12f, 2.6f, 12.4f)
                lineTo(11.6f, 21.4f)
                curveTo(12f, 21.8f, 12.5f, 22f, 13f, 22f)
                curveTo(13.5f, 22f, 14f, 21.8f, 14.4f, 21.4f)
                lineTo(21.4f, 14.4f)
                curveTo(21.8f, 14f, 22f, 13.5f, 22f, 13f)
                curveTo(22f, 12.5f, 21.8f, 12f, 21.4f, 11.6f)
                moveTo(13f, 20f)
                lineTo(4f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                lineTo(20f, 13f)
                moveTo(6.5f, 5f)
                curveTo(7.3f, 5f, 8f, 5.7f, 8f, 6.5f)
                reflectiveCurveTo(7.3f, 8f, 6.5f, 8f)
                reflectiveCurveTo(5f, 7.3f, 5f, 6.5f)
                reflectiveCurveTo(5.7f, 5f, 6.5f, 5f)
                moveTo(10.1f, 8.9f)
                lineTo(11.5f, 7.5f)
                lineTo(17f, 13f)
                lineTo(15.6f, 14.4f)
                lineTo(10.1f, 8.9f)
                moveTo(7.6f, 11.4f)
                lineTo(9f, 10f)
                lineTo(13f, 14f)
                lineTo(11.6f, 15.4f)
                lineTo(7.6f, 11.4f)
                close()
            }
        }.build()

        return _TagTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagTextOutline: ImageVector? = null
