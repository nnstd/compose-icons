package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderClock: ImageVector
    get() {
        if (_FolderClock != null) {
            return _FolderClock!!
        }
        _FolderClock = ImageVector.Builder(
            name = "FolderClock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 4f)
                curveTo(1.89f, 4f, 1f, 4.89f, 1f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 20f)
                horizontalLineTo(10.26f)
                curveTo(11.57f, 21.88f, 13.71f, 23f, 16f, 23f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 16f)
                curveTo(23f, 14.17f, 22.28f, 12.42f, 21f, 11.11f)
                verticalLineTo(8f)
                curveTo(21f, 6.89f, 20.1f, 6f, 19f, 6f)
                horizontalLineTo(11f)
                lineTo(9f, 4f)
                horizontalLineTo(3f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                moveTo(15f, 12f)
                verticalLineTo(17f)
                lineTo(18.61f, 19.16f)
                lineTo(19.36f, 17.94f)
                lineTo(16.5f, 16.25f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _FolderClock!!
    }

@Suppress("ObjectPropertyName")
private var _FolderClock: ImageVector? = null
