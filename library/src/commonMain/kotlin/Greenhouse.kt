package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Greenhouse: ImageVector
    get() {
        if (_Greenhouse != null) {
            return _Greenhouse!!
        }
        _Greenhouse = ImageVector.Builder(
            name = "Greenhouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                lineTo(4f, 9f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                moveTo(10f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                moveTo(16f, 10f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                moveTo(15.33f, 8f)
                horizontalLineTo(8.67f)
                lineTo(12f, 5.5f)
                lineTo(15.33f, 8f)
                moveTo(8f, 10f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(6f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(16f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _Greenhouse!!
    }

@Suppress("ObjectPropertyName")
private var _Greenhouse: ImageVector? = null
