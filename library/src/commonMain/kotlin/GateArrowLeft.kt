package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateArrowLeft: ImageVector
    get() {
        if (_GateArrowLeft != null) {
            return _GateArrowLeft!!
        }
        _GateArrowLeft = ImageVector.Builder(
            name = "GateArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(14.81f)
                curveTo(3.62f, 14.45f, 4.3f, 14.21f, 5f, 14.09f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(14.09f)
                curveTo(7.7f, 14.21f, 8.38f, 14.45f, 9f, 14.81f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(16.69f)
                curveTo(11.65f, 17.67f, 12f, 18.82f, 12f, 20f)
                curveTo(12f, 20.34f, 11.97f, 20.67f, 11.91f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(15f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(2f, 20f)
                lineTo(5f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                lineTo(2f, 20f)
                close()
            }
        }.build()

        return _GateArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _GateArrowLeft: ImageVector? = null
