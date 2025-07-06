package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentOutline: ImageVector
    get() {
        if (_FileDocumentOutline != null) {
            return _FileDocumentOutline!!
        }
        _FileDocumentOutline = ImageVector.Builder(
            name = "FileDocumentOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(6f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                moveTo(8f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                moveTo(8f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _FileDocumentOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentOutline: ImageVector? = null
