package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileMinusOutline: ImageVector
    get() {
        if (_FileMinusOutline != null) {
            return _FileMinusOutline!!
        }
        _FileMinusOutline = ImageVector.Builder(
            name = "FileMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.81f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.11f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.9f, 4.89f, 2f, 6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13f, 19f, 13f)
                reflectiveCurveTo(18.33f, 13.04f, 18f, 13.09f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(13.09f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22f)
                moveTo(23f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FileMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileMinusOutline: ImageVector? = null
