package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderHidden: ImageVector
    get() {
        if (_FolderHidden != null) {
            return _FolderHidden!!
        }
        _FolderHidden = ImageVector.Builder(
            name = "FolderHidden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                moveTo(4f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(16f)
                horizontalLineTo(4f)
                moveTo(2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                moveTo(18f, 8f)
                horizontalLineTo(22f)
                curveTo(22f, 6.89f, 21.1f, 6f, 20f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                moveTo(22f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                moveTo(20f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                moveTo(9f, 20f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                moveTo(5f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                curveTo(2f, 19.11f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                moveTo(20f, 17f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.11f, 22f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(4f, 8f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                curveTo(2.89f, 4f, 2f, 4.89f, 2f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                moveTo(17f, 18f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                moveTo(13f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                moveTo(17f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                moveTo(10f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _FolderHidden!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHidden: ImageVector? = null
