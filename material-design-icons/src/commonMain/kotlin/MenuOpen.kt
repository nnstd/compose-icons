package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MenuOpen: ImageVector
    get() {
        if (_MenuOpen != null) {
            return _MenuOpen!!
        }
        _MenuOpen = ImageVector.Builder(
            name = "MenuOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15.61f)
                lineTo(19.59f, 17f)
                lineTo(14.58f, 12f)
                lineTo(19.59f, 7f)
                lineTo(21f, 8.39f)
                lineTo(17.44f, 12f)
                lineTo(21f, 15.61f)
                moveTo(3f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(3f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(3f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _MenuOpen!!
    }

@Suppress("ObjectPropertyName")
private var _MenuOpen: ImageVector? = null
