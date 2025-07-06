package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChiliAlert: ImageVector
    get() {
        if (_ChiliAlert != null) {
            return _ChiliAlert!!
        }
        _ChiliAlert = ImageVector.Builder(
            name = "ChiliAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.25f, 7.5f)
                lineTo(7.73f, 6.63f)
                curveTo(8.26f, 5.7f, 9.03f, 5f, 9.94f, 4.69f)
                curveTo(9.8f, 4.29f, 9.44f, 4f, 9f, 4f)
                verticalLineTo(2f)
                curveTo(10.54f, 2f, 11.79f, 3.16f, 11.97f, 4.65f)
                curveTo(12.91f, 4.94f, 13.72f, 5.66f, 14.27f, 6.63f)
                lineTo(12.75f, 7.5f)
                lineTo(11f, 6.5f)
                lineTo(9.25f, 7.5f)
                moveTo(14f, 8.28f)
                lineTo(12.75f, 9f)
                lineTo(11f, 8f)
                lineTo(9.25f, 9f)
                lineTo(8f, 8.28f)
                curveTo(7.4f, 8.63f, 7f, 9.27f, 7f, 10f)
                verticalLineTo(11f)
                curveTo(7f, 20f, 15f, 22f, 15f, 22f)
                verticalLineTo(10f)
                curveTo(15f, 9.27f, 14.6f, 8.63f, 14f, 8.28f)
                moveTo(17f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                moveTo(17f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ChiliAlert!!
    }

@Suppress("ObjectPropertyName")
private var _ChiliAlert: ImageVector? = null
