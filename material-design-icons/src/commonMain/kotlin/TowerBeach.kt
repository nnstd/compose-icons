package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TowerBeach: ImageVector
    get() {
        if (_TowerBeach != null) {
            return _TowerBeach!!
        }
        _TowerBeach = ImageVector.Builder(
            name = "TowerBeach",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(17.64f)
                lineTo(21f, 23f)
                horizontalLineTo(18.93f)
                lineTo(18.37f, 20.83f)
                lineTo(12f, 17.15f)
                lineTo(5.63f, 20.83f)
                lineTo(5.07f, 23f)
                horizontalLineTo(3f)
                lineTo(6.36f, 10f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                lineTo(18f, 1f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                moveTo(7.28f, 14.43f)
                lineTo(6.33f, 18.12f)
                lineTo(10f, 16f)
                lineTo(7.28f, 14.43f)
                moveTo(15.57f, 10f)
                horizontalLineTo(8.43f)
                lineTo(7.8f, 12.42f)
                lineTo(12f, 14.85f)
                lineTo(16.2f, 12.42f)
                lineTo(15.57f, 10f)
                moveTo(17.67f, 18.12f)
                lineTo(16.72f, 14.43f)
                lineTo(14f, 16f)
                lineTo(17.67f, 18.12f)
                close()
            }
        }.build()

        return _TowerBeach!!
    }

@Suppress("ObjectPropertyName")
private var _TowerBeach: ImageVector? = null
