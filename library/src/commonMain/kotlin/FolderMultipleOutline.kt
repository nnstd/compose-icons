package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMultipleOutline: ImageVector
    get() {
        if (_FolderMultipleOutline != null) {
            return _FolderMultipleOutline!!
        }
        _FolderMultipleOutline = ImageVector.Builder(
            name = "FolderMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 6f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 18f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(12f)
                lineTo(14f, 4f)
                horizontalLineTo(22f)
                moveTo(2f, 6f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                moveTo(6f, 6f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _FolderMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMultipleOutline: ImageVector? = null
