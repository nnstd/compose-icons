package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileTree: ImageVector
    get() {
        if (_FileTree != null) {
            return _FileTree!!
        }
        _FileTree = ImageVector.Builder(
            name = "FileTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(15f, 10f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                moveTo(15f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(13f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(7f)
                lineTo(5f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _FileTree!!
    }

@Suppress("ObjectPropertyName")
private var _FileTree: ImageVector? = null
