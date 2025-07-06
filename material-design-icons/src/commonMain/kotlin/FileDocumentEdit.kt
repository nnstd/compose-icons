package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentEdit: ImageVector
    get() {
        if (_FileDocumentEdit != null) {
            return _FileDocumentEdit!!
        }
        _FileDocumentEdit = ImageVector.Builder(
            name = "FileDocumentEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20.09f)
                lineTo(12.09f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(14.09f)
                lineTo(16.09f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(18.09f)
                lineTo(20f, 10.09f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(20.15f, 13f)
                curveTo(20f, 13f, 19.86f, 13.05f, 19.75f, 13.16f)
                lineTo(18.73f, 14.18f)
                lineTo(20.82f, 16.26f)
                lineTo(21.84f, 15.25f)
                curveTo(22.05f, 15.03f, 22.05f, 14.67f, 21.84f, 14.46f)
                lineTo(20.54f, 13.16f)
                curveTo(20.43f, 13.05f, 20.29f, 13f, 20.15f, 13f)
                moveTo(18.14f, 14.77f)
                lineTo(12f, 20.92f)
                verticalLineTo(23f)
                horizontalLineTo(14.08f)
                lineTo(20.23f, 16.85f)
                lineTo(18.14f, 14.77f)
                close()
            }
        }.build()

        return _FileDocumentEdit!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentEdit: ImageVector? = null
