package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TramSide: ImageVector
    get() {
        if (_TramSide != null) {
            return _TramSide!!
        }
        _TramSide = ImageVector.Builder(
            name = "TramSide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                lineTo(5f, 4f)
                lineTo(7.5f, 6f)
                horizontalLineTo(5f)
                curveTo(5f, 6f, 2f, 6f, 2f, 9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                curveTo(7f, 19f, 7f, 17f, 9f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(10.5f)
                lineTo(13f, 4f)
                lineTo(9f, 1f)
                moveTo(4f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                moveTo(11f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(4f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                moveTo(9f, 19f)
                verticalLineTo(19.5f)
                curveTo(9f, 20.88f, 10.12f, 22f, 11.5f, 22f)
                curveTo(12.5f, 22f, 13.39f, 21.41f, 13.79f, 20.5f)
                horizontalLineTo(15.21f)
                curveTo(15.61f, 21.41f, 16.5f, 22f, 17.5f, 22f)
                curveTo(18.88f, 22f, 20f, 20.88f, 20f, 19.5f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _TramSide!!
    }

@Suppress("ObjectPropertyName")
private var _TramSide: ImageVector? = null
