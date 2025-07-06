package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GeneratorPortable: ImageVector
    get() {
        if (_GeneratorPortable != null) {
            return _GeneratorPortable!!
        }
        _GeneratorPortable = ImageVector.Builder(
            name = "GeneratorPortable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 2f)
                curveTo(5.9f, 2f, 5f, 2.9f, 5f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                curveTo(2.9f, 6f, 2f, 6.9f, 2f, 8f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                curveTo(4f, 21.55f, 4.45f, 22f, 5f, 22f)
                horizontalLineTo(6f)
                curveTo(6.55f, 22f, 7f, 21.55f, 7f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                curveTo(17f, 21.55f, 17.45f, 22f, 18f, 22f)
                horizontalLineTo(19f)
                curveTo(19.55f, 22f, 20f, 21.55f, 20f, 21f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.11f, 6f, 20f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                curveTo(19f, 2.9f, 18.11f, 2f, 17f, 2f)
                horizontalLineTo(7f)
                moveTo(14f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(14f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                moveTo(7f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                moveTo(7f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                lineTo(6f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                lineTo(7f, 8f)
                close()
            }
        }.build()

        return _GeneratorPortable!!
    }

@Suppress("ObjectPropertyName")
private var _GeneratorPortable: ImageVector? = null
