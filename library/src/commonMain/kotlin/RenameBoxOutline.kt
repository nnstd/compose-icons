package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RenameBoxOutline: ImageVector
    get() {
        if (_RenameBoxOutline != null) {
            return _RenameBoxOutline!!
        }
        _RenameBoxOutline = ImageVector.Builder(
            name = "RenameBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                horizontalLineTo(11.5f)
                lineTo(13.5f, 15f)
                horizontalLineTo(17f)
                moveTo(7f, 17f)
                verticalLineTo(14.5f)
                lineTo(14.9f, 6.7f)
                curveTo(15.1f, 6.5f, 15.4f, 6.5f, 15.6f, 6.7f)
                lineTo(17.4f, 8.5f)
                curveTo(17.6f, 8.7f, 17.6f, 9f, 17.4f, 9.2f)
                lineTo(9.5f, 17f)
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                close()
            }
        }.build()

        return _RenameBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RenameBoxOutline: ImageVector? = null
