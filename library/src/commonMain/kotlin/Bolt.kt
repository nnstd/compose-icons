package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bolt: ImageVector
    get() {
        if (_Bolt != null) {
            return _Bolt!!
        }
        _Bolt = ImageVector.Builder(
            name = "Bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17.7f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(20.3f)
                lineTo(14f, 17.7f)
                moveTo(17f, 3f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(15f, 7f)
                lineTo(14f, 7.7f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(10.3f)
                lineTo(9f, 11f)
                verticalLineTo(12f)
                lineTo(15f, 8.1f)
                verticalLineTo(7f)
                moveTo(15f, 11f)
                lineTo(14f, 11.7f)
                verticalLineTo(9.7f)
                lineTo(10f, 12.4f)
                verticalLineTo(14.4f)
                lineTo(9f, 15f)
                verticalLineTo(16f)
                lineTo(15f, 12.1f)
                verticalLineTo(11f)
                moveTo(15f, 15f)
                lineTo(14f, 15.7f)
                verticalLineTo(13.7f)
                lineTo(10f, 16.4f)
                verticalLineTo(18.4f)
                lineTo(9f, 19f)
                verticalLineTo(20f)
                lineTo(15f, 16.1f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Bolt!!
    }

@Suppress("ObjectPropertyName")
private var _Bolt: ImageVector? = null
