package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderOpenOutline: ImageVector
    get() {
        if (_FolderOpenOutline != null) {
            return _FolderOpenOutline!!
        }
        _FolderOpenOutline = ImageVector.Builder(
            name = "FolderOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.1f, 10f)
                lineTo(4f, 18f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(19f)
                curveTo(19.9f, 20f, 20.7f, 19.4f, 20.9f, 18.5f)
                lineTo(23.2f, 10f)
                horizontalLineTo(6.1f)
                moveTo(19f, 18f)
                horizontalLineTo(6f)
                lineTo(7.6f, 12f)
                horizontalLineTo(20.6f)
                lineTo(19f, 18f)
                close()
            }
        }.build()

        return _FolderOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderOpenOutline: ImageVector? = null
