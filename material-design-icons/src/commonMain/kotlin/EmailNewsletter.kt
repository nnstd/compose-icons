package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailNewsletter: ImageVector
    get() {
        if (_EmailNewsletter != null) {
            return _EmailNewsletter!!
        }
        _EmailNewsletter = ImageVector.Builder(
            name = "EmailNewsletter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.64f)
                lineTo(8.23f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                lineTo(2.97f, 6.29f)
                curveTo(2.39f, 6.64f, 2f, 7.27f, 2f, 8f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 7.27f, 21.61f, 6.64f, 21.03f, 6.29f)
                lineTo(19f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(15.77f)
                moveTo(7f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(9.88f)
                lineTo(12f, 13f)
                lineTo(7f, 9.88f)
                moveTo(8f, 6f)
                verticalLineTo(7.5f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                moveTo(5f, 7.38f)
                verticalLineTo(8.63f)
                lineTo(4f, 8f)
                moveTo(19f, 7.38f)
                lineTo(20f, 8f)
                lineTo(19f, 8.63f)
                moveTo(8f, 8.5f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8.5f)
                close()
            }
        }.build()

        return _EmailNewsletter!!
    }

@Suppress("ObjectPropertyName")
private var _EmailNewsletter: ImageVector? = null
