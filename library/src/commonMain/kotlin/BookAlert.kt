package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookAlert: ImageVector
    get() {
        if (_BookAlert != null) {
            return _BookAlert!!
        }
        _BookAlert = ImageVector.Builder(
            name = "BookAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                lineTo(7.5f, 7.5f)
                lineTo(10f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                curveTo(17.1f, 2f, 18f, 2.89f, 18f, 4f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _BookAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BookAlert: ImageVector? = null
