package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LibraryShelves: ImageVector
    get() {
        if (_LibraryShelves != null) {
            return _LibraryShelves!!
        }
        _LibraryShelves = ImageVector.Builder(
            name = "LibraryShelves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 9f)
                verticalLineTo(1.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(9f)
                horizontalLineTo(13.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(4.65f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(10.5f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(19.5f)
                moveTo(19.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(21f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.65f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(22.5f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.5f)
                close()
            }
        }.build()

        return _LibraryShelves!!
    }

@Suppress("ObjectPropertyName")
private var _LibraryShelves: ImageVector? = null
