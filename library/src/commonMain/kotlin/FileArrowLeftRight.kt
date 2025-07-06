package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileArrowLeftRight: ImageVector
    get() {
        if (_FileArrowLeftRight != null) {
            return _FileArrowLeftRight!!
        }
        _FileArrowLeftRight = ImageVector.Builder(
            name = "FileArrowLeftRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.89f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(13.81f)
                curveTo(13.3f, 21.12f, 13f, 20.1f, 13f, 19f)
                curveTo(13f, 15.69f, 15.69f, 13f, 19f, 13f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(3.5f)
                moveTo(20f, 19.5f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(14.5f)
                lineTo(23f, 17f)
                lineTo(20f, 19.5f)
                moveTo(18f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(23.5f)
                lineTo(15f, 21f)
                lineTo(18f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FileArrowLeftRight!!
    }

@Suppress("ObjectPropertyName")
private var _FileArrowLeftRight: ImageVector? = null
