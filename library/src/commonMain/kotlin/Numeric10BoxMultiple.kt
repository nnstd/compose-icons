package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric10BoxMultiple: ImageVector
    get() {
        if (_Numeric10BoxMultiple != null) {
            return _Numeric10BoxMultiple!!
        }
        _Numeric10BoxMultiple = ImageVector.Builder(
            name = "Numeric10BoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(21f)
                horizontalLineTo(19f)
                verticalLineTo(23f)
                horizontalLineTo(3f)
                curveTo(1.9f, 23f, 1f, 22.11f, 1f, 21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(16f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                moveTo(21f, 1f)
                horizontalLineTo(7f)
                curveTo(5.9f, 1f, 5f, 1.9f, 5f, 3f)
                verticalLineTo(17f)
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(21f)
                curveTo(22.11f, 19f, 23f, 18.11f, 23f, 17f)
                verticalLineTo(3f)
                curveTo(23f, 1.9f, 22.11f, 1f, 21f, 1f)
                moveTo(12f, 15f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                moveTo(20f, 13f)
                curveTo(20f, 14.11f, 19.11f, 15f, 18f, 15f)
                horizontalLineTo(16f)
                curveTo(14.9f, 15f, 14f, 14.11f, 14f, 13f)
                verticalLineTo(7f)
                curveTo(14f, 5.9f, 14.9f, 5f, 16f, 5f)
                horizontalLineTo(18f)
                curveTo(19.11f, 5f, 20f, 5.9f, 20f, 7f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Numeric10BoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric10BoxMultiple: ImageVector? = null
