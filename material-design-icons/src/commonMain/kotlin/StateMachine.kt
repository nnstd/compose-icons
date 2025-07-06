package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StateMachine: ImageVector
    get() {
        if (_StateMachine != null) {
            return _StateMachine!!
        }
        _StateMachine = ImageVector.Builder(
            name = "StateMachine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.27f, 17.05f)
                curveTo(6.72f, 17.58f, 7f, 18.25f, 7f, 19f)
                curveTo(7f, 20.66f, 5.66f, 22f, 4f, 22f)
                reflectiveCurveTo(1f, 20.66f, 1f, 19f)
                reflectiveCurveTo(2.34f, 16f, 4f, 16f)
                curveTo(4.18f, 16f, 4.36f, 16f, 4.53f, 16.05f)
                lineTo(7.6f, 10.69f)
                lineTo(5.86f, 9.7f)
                lineTo(9.95f, 8.58f)
                lineTo(11.07f, 12.67f)
                lineTo(9.33f, 11.68f)
                lineTo(6.27f, 17.05f)
                moveTo(20f, 16f)
                curveTo(18.7f, 16f, 17.6f, 16.84f, 17.18f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                lineTo(8f, 19f)
                lineTo(11f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(17.18f)
                curveTo(17.6f, 21.16f, 18.7f, 22f, 20f, 22f)
                curveTo(21.66f, 22f, 23f, 20.66f, 23f, 19f)
                reflectiveCurveTo(21.66f, 16f, 20f, 16f)
                moveTo(12f, 8f)
                curveTo(12.18f, 8f, 12.36f, 8f, 12.53f, 7.95f)
                lineTo(15.6f, 13.31f)
                lineTo(13.86f, 14.3f)
                lineTo(17.95f, 15.42f)
                lineTo(19.07f, 11.33f)
                lineTo(17.33f, 12.32f)
                lineTo(14.27f, 6.95f)
                curveTo(14.72f, 6.42f, 15f, 5.75f, 15f, 5f)
                curveTo(15f, 3.34f, 13.66f, 2f, 12f, 2f)
                reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                reflectiveCurveTo(10.34f, 8f, 12f, 8f)
                close()
            }
        }.build()

        return _StateMachine!!
    }

@Suppress("ObjectPropertyName")
private var _StateMachine: ImageVector? = null
