package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoleculeCo: ImageVector
    get() {
        if (_MoleculeCo != null) {
            return _MoleculeCo!!
        }
        _MoleculeCo = ImageVector.Builder(
            name = "MoleculeCo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                curveTo(6.9f, 7f, 6f, 7.9f, 6f, 9f)
                verticalLineTo(15f)
                curveTo(6f, 16.11f, 6.9f, 17f, 8f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                moveTo(14f, 7f)
                curveTo(12.9f, 7f, 12f, 7.9f, 12f, 9f)
                verticalLineTo(15f)
                curveTo(12f, 16.11f, 12.9f, 17f, 14f, 17f)
                horizontalLineTo(16f)
                curveTo(17.11f, 17f, 18f, 16.11f, 18f, 15f)
                verticalLineTo(9f)
                curveTo(18f, 7.9f, 17.11f, 7f, 16f, 7f)
                horizontalLineTo(14f)
                moveTo(14f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
            }
        }.build()

        return _MoleculeCo!!
    }

@Suppress("ObjectPropertyName")
private var _MoleculeCo: ImageVector? = null
