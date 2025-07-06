package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderTextOutline: ImageVector
    get() {
        if (_FolderTextOutline != null) {
            return _FolderTextOutline!!
        }
        _FolderTextOutline = ImageVector.Builder(
            name = "FolderTextOutline",
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
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                moveTo(15f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                moveTo(18f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FolderTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderTextOutline: ImageVector? = null
