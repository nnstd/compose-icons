package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookCheck: ImageVector
    get() {
        if (_BookCheck != null) {
            return _BookCheck!!
        }
        _BookCheck = ImageVector.Builder(
            name = "BookCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 22.16f)
                lineTo(14f, 19.16f)
                lineTo(15.16f, 18f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
                moveTo(6f, 22f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                lineTo(9.5f, 7.5f)
                lineTo(12f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                curveTo(19.1f, 2f, 20f, 2.89f, 20f, 4f)
                verticalLineTo(13.34f)
                curveTo(19.37f, 13.12f, 18.7f, 13f, 18f, 13f)
                curveTo(14.69f, 13f, 12f, 15.69f, 12f, 19f)
                curveTo(12f, 20.09f, 12.29f, 21.12f, 12.8f, 22f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _BookCheck!!
    }

@Suppress("ObjectPropertyName")
private var _BookCheck: ImageVector? = null
