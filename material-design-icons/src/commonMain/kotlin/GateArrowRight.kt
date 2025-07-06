package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GateArrowRight: ImageVector
    get() {
        if (_GateArrowRight != null) {
            return _GateArrowRight!!
        }
        _GateArrowRight = ImageVector.Builder(
            name = "GateArrowRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(12.09f)
                curveTo(12.03f, 20.67f, 12f, 20.34f, 12f, 20f)
                curveTo(12f, 18.82f, 12.35f, 17.67f, 13f, 16.69f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(14.81f)
                curveTo(15.62f, 14.45f, 16.3f, 14.21f, 17f, 14.09f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(14.09f)
                curveTo(19.7f, 14.21f, 20.38f, 14.45f, 21f, 14.81f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                moveTo(9f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                moveTo(19f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                lineTo(22f, 20f)
                lineTo(19f, 17f)
                close()
            }
        }.build()

        return _GateArrowRight!!
    }

@Suppress("ObjectPropertyName")
private var _GateArrowRight: ImageVector? = null
