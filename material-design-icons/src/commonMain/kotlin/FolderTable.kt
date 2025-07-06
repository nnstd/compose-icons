package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderTable: ImageVector
    get() {
        if (_FolderTable != null) {
            return _FolderTable!!
        }
        _FolderTable = ImageVector.Builder(
            name = "FolderTable",
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
                moveTo(12f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                moveTo(16f, 9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                moveTo(12f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                moveTo(16f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                moveTo(12f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                moveTo(16f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FolderTable!!
    }

@Suppress("ObjectPropertyName")
private var _FolderTable: ImageVector? = null
