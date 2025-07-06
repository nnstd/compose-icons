package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderMultiple: ImageVector
    get() {
        if (_FolderMultiple != null) {
            return _FolderMultiple!!
        }
        _FolderMultiple = ImageVector.Builder(
            name = "FolderMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                horizontalLineTo(14f)
                lineTo(12f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 18f)
                horizontalLineTo(22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 16f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 4f)
                moveTo(2f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 22f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _FolderMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMultiple: ImageVector? = null
