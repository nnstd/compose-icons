package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hvac: ImageVector
    get() {
        if (_Hvac != null) {
            return _Hvac!!
        }
        _Hvac = ImageVector.Builder(
            name = "Hvac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.58f, 14f)
                curveTo(8.3f, 13.55f, 8.11f, 13.03f, 8.06f, 12.5f)
                horizontalLineTo(15.94f)
                curveTo(15.89f, 13.03f, 15.7f, 13.55f, 15.47f, 14f)
                horizontalLineTo(8.58f)
                moveTo(12f, 16f)
                curveTo(10.97f, 16f, 10.08f, 15.61f, 9.38f, 15f)
                horizontalLineTo(14.63f)
                curveTo(13.92f, 15.61f, 13.03f, 16f, 12f, 16f)
                moveTo(12f, 8f)
                curveTo(13.03f, 8f, 13.92f, 8.39f, 14.63f, 9f)
                horizontalLineTo(9.38f)
                curveTo(10.08f, 8.39f, 10.97f, 8f, 12f, 8f)
                moveTo(8.58f, 10f)
                horizontalLineTo(15.42f)
                curveTo(15.7f, 10.45f, 15.89f, 10.97f, 15.94f, 11.5f)
                horizontalLineTo(8.06f)
                curveTo(8.11f, 10.97f, 8.3f, 10.45f, 8.58f, 10f)
                moveTo(3f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(12f, 18f)
                curveTo(8.67f, 18f, 6f, 15.33f, 6f, 12f)
                reflectiveCurveTo(8.67f, 6f, 12f, 6f)
                reflectiveCurveTo(18f, 8.67f, 18f, 12f)
                reflectiveCurveTo(15.33f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _Hvac!!
    }

@Suppress("ObjectPropertyName")
private var _Hvac: ImageVector? = null
