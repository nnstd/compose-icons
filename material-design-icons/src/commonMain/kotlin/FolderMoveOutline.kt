package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMoveOutline: ImageVector
    get() {
        if (_FolderMoveOutline != null) {
            return _FolderMoveOutline!!
        }
        _FolderMoveOutline = ImageVector.Builder(
            name = "FolderMoveOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                moveTo(12f, 6f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.11f, 6f, 20f, 6f)
                horizontalLineTo(12f)
                moveTo(11f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                lineTo(19f, 13f)
                lineTo(15f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FolderMoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMoveOutline: ImageVector? = null
