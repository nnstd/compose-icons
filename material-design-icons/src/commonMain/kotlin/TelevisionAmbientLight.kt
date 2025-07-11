package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TelevisionAmbientLight: ImageVector
    get() {
        if (_TelevisionAmbientLight != null) {
            return _TelevisionAmbientLight!!
        }
        _TelevisionAmbientLight = ImageVector.Builder(
            name = "TelevisionAmbientLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(3f, 14f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                moveTo(5f, 5.12f)
                lineTo(2.88f, 3f)
                lineTo(1.46f, 4.41f)
                lineTo(3.59f, 6.54f)
                lineTo(5f, 5.12f)
                moveTo(10f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(24f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(24f)
                verticalLineTo(9f)
                moveTo(16f, 5f)
                verticalLineTo(2f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(20.41f, 6.54f)
                lineTo(22.54f, 4.42f)
                lineTo(21.12f, 3f)
                lineTo(19f, 5.12f)
                lineTo(20.41f, 6.54f)
                moveTo(24f, 14f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                horizontalLineTo(24f)
                verticalLineTo(14f)
                moveTo(19f, 9f)
                verticalLineTo(16f)
                curveTo(19f, 17.1f, 18.1f, 18f, 17f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                curveTo(5.9f, 18f, 5f, 17.1f, 5f, 16f)
                verticalLineTo(9f)
                curveTo(5f, 7.9f, 5.9f, 7f, 7f, 7f)
                horizontalLineTo(17f)
                curveTo(18.1f, 7f, 19f, 7.9f, 19f, 9f)
                moveTo(17f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                moveTo(19f, 19.88f)
                lineTo(21.12f, 22f)
                lineTo(22.54f, 20.59f)
                lineTo(20.41f, 18.47f)
                lineTo(19f, 19.88f)
                moveTo(3.59f, 18.46f)
                lineTo(1.47f, 20.59f)
                lineTo(2.88f, 22f)
                lineTo(5f, 19.88f)
                lineTo(3.59f, 18.46f)
                close()
            }
        }.build()

        return _TelevisionAmbientLight!!
    }

@Suppress("ObjectPropertyName")
private var _TelevisionAmbientLight: ImageVector? = null
