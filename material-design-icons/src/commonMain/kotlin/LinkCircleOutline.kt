package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LinkCircleOutline: ImageVector
    get() {
        if (_LinkCircleOutline != null) {
            return _LinkCircleOutline!!
        }
        _LinkCircleOutline = ImageVector.Builder(
            name = "LinkCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 16f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                curveTo(9.67f, 14f, 8f, 13.9f, 8f, 12f)
                curveTo(8f, 10.17f, 9.54f, 10f, 10f, 10f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                curveTo(8.39f, 8f, 6f, 9.07f, 6f, 12f)
                curveTo(6f, 14.94f, 8.39f, 16f, 10f, 16f)
                moveTo(13f, 16f)
                horizontalLineTo(14f)
                curveTo(15.61f, 16f, 18f, 14.94f, 18f, 12f)
                curveTo(18f, 9.07f, 15.61f, 8f, 14f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(14.33f, 10f, 16f, 10.1f, 16f, 12f)
                curveTo(16f, 13.83f, 14.46f, 14f, 14f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                moveTo(9f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(8.17f, 2.76f)
                curveTo(9.39f, 2.26f, 10.69f, 2f, 12f, 2f)
                curveTo(13.31f, 2f, 14.61f, 2.26f, 15.83f, 2.76f)
                curveTo(17.04f, 3.26f, 18.14f, 4f, 19.07f, 4.93f)
                curveTo(20f, 5.86f, 20.74f, 6.96f, 21.24f, 8.17f)
                curveTo(21.74f, 9.39f, 22f, 10.69f, 22f, 12f)
                curveTo(22f, 14.65f, 20.95f, 17.2f, 19.07f, 19.07f)
                curveTo(17.2f, 20.95f, 14.65f, 22f, 12f, 22f)
                curveTo(10.69f, 22f, 9.39f, 21.74f, 8.17f, 21.24f)
                curveTo(6.96f, 20.74f, 5.86f, 20f, 4.93f, 19.07f)
                curveTo(3.05f, 17.2f, 2f, 14.65f, 2f, 12f)
                curveTo(2f, 9.35f, 3.05f, 6.8f, 4.93f, 4.93f)
                curveTo(5.86f, 4f, 6.96f, 3.26f, 8.17f, 2.76f)
                moveTo(6.34f, 17.66f)
                curveTo(7.84f, 19.16f, 9.88f, 20f, 12f, 20f)
                curveTo(14.12f, 20f, 16.16f, 19.16f, 17.66f, 17.66f)
                curveTo(19.16f, 16.16f, 20f, 14.12f, 20f, 12f)
                curveTo(20f, 9.88f, 19.16f, 7.84f, 17.66f, 6.34f)
                curveTo(16.16f, 4.84f, 14.12f, 4f, 12f, 4f)
                curveTo(9.88f, 4f, 7.84f, 4.84f, 6.34f, 6.34f)
                curveTo(4.84f, 7.84f, 4f, 9.88f, 4f, 12f)
                curveTo(4f, 14.12f, 4.84f, 16.16f, 6.34f, 17.66f)
                close()
            }
        }.build()

        return _LinkCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LinkCircleOutline: ImageVector? = null
