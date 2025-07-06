package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookRemove: ImageVector
    get() {
        if (_BookRemove != null) {
            return _BookRemove!!
        }
        _BookRemove = ImageVector.Builder(
            name = "BookRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                curveTo(13f, 20.1f, 13.3f, 21.12f, 13.81f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(12f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.89f, 20f, 4f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(15.69f, 13f, 13f, 15.69f, 13f, 19f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _BookRemove!!
    }

@Suppress("ObjectPropertyName")
private var _BookRemove: ImageVector? = null
