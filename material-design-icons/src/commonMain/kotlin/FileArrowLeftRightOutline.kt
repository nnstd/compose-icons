package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileArrowLeftRightOutline: ImageVector
    get() {
        if (_FileArrowLeftRightOutline != null) {
            return _FileArrowLeftRightOutline!!
        }
        _FileArrowLeftRightOutline = ImageVector.Builder(
            name = "FileArrowLeftRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.09f, 20f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                curveTo(18.66f, 13f, 18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                moveTo(23f, 17f)
                lineTo(20f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(19.5f)
                lineTo(23f, 17f)
                moveTo(18f, 18.5f)
                lineTo(15f, 21f)
                lineTo(18f, 23.5f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _FileArrowLeftRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileArrowLeftRightOutline: ImageVector? = null
