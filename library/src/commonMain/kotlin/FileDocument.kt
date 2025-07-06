package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocument: ImageVector
    get() {
        if (_FileDocument != null) {
            return _FileDocument!!
        }
        _FileDocument = ImageVector.Builder(
            name = "FileDocument",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                moveTo(15f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                moveTo(18f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FileDocument!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocument: ImageVector? = null
