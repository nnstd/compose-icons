package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileDocumentRefreshOutline: ImageVector
    get() {
        if (_FileDocumentRefreshOutline != null) {
            return _FileDocumentRefreshOutline!!
        }
        _FileDocumentRefreshOutline = ImageVector.Builder(
            name = "FileDocumentRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(5.47f, 2f, 4.96f, 2.21f, 4.59f, 2.59f)
                curveTo(4.21f, 2.96f, 4f, 3.47f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 20.53f, 4.21f, 21.04f, 4.59f, 21.41f)
                curveTo(4.96f, 21.79f, 5.47f, 22f, 6f, 22f)
                horizontalLineTo(13f)
                curveTo(12.63f, 21.4f, 12.34f, 20.72f, 12.17f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                horizontalLineTo(18.5f)
                curveTo(19f, 12f, 19.5f, 12.06f, 20f, 12.17f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                moveTo(12f, 18f)
                curveTo(12.07f, 17.3f, 12.24f, 16.62f, 12.5f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(12f)
                moveTo(13.81f, 14f)
                curveTo(14.43f, 13.36f, 15.17f, 12.85f, 16f, 12.5f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(13.81f)
                moveTo(18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                curveTo(15.5f, 19.88f, 16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.54f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                curveTo(14f, 16.29f, 15.79f, 14.5f, 18f, 14.5f)
                close()
            }
        }.build()

        return _FileDocumentRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileDocumentRefreshOutline: ImageVector? = null
