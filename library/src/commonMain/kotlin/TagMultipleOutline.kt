package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TagMultipleOutline: ImageVector
    get() {
        if (_TagMultipleOutline != null) {
            return _TagMultipleOutline!!
        }
        _TagMultipleOutline = ImageVector.Builder(
            name = "TagMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 10f)
                curveTo(7.3f, 10f, 8f, 9.3f, 8f, 8.5f)
                reflectiveCurveTo(7.3f, 7f, 6.5f, 7f)
                reflectiveCurveTo(5f, 7.7f, 5f, 8.5f)
                reflectiveCurveTo(5.7f, 10f, 6.5f, 10f)
                moveTo(9f, 6f)
                lineTo(16f, 13f)
                lineTo(11f, 18f)
                lineTo(4f, 11f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                moveTo(9f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(11f)
                curveTo(2f, 11.6f, 2.2f, 12.1f, 2.6f, 12.4f)
                lineTo(9.6f, 19.4f)
                curveTo(9.9f, 19.8f, 10.4f, 20f, 11f, 20f)
                reflectiveCurveTo(12.1f, 19.8f, 12.4f, 19.4f)
                lineTo(17.4f, 14.4f)
                curveTo(17.8f, 14f, 18f, 13.5f, 18f, 13f)
                curveTo(18f, 12.4f, 17.8f, 11.9f, 17.4f, 11.6f)
                lineTo(10.4f, 4.6f)
                curveTo(10.1f, 4.2f, 9.6f, 4f, 9f, 4f)
                moveTo(13.5f, 5.7f)
                lineTo(14.5f, 4.7f)
                lineTo(21.4f, 11.6f)
                curveTo(21.8f, 12f, 22f, 12.5f, 22f, 13f)
                reflectiveCurveTo(21.8f, 14.1f, 21.4f, 14.4f)
                lineTo(16f, 19.8f)
                lineTo(15f, 18.8f)
                lineTo(20.7f, 13f)
                lineTo(13.5f, 5.7f)
                close()
            }
        }.build()

        return _TagMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TagMultipleOutline: ImageVector? = null
