package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderTableOutline: ImageVector
    get() {
        if (_FolderTableOutline != null) {
            return _FolderTableOutline!!
        }
        _FolderTableOutline = ImageVector.Builder(
            name = "FolderTableOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.89f, 21.1f, 6f, 20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                moveTo(4f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(12f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                moveTo(16f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                moveTo(12f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                moveTo(16f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                moveTo(12f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                moveTo(16f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _FolderTableOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderTableOutline: ImageVector? = null
