package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeThermometerOutline: ImageVector
    get() {
        if (_HomeThermometerOutline != null) {
            return _HomeThermometerOutline!!
        }
        _HomeThermometerOutline = ImageVector.Builder(
            name = "HomeThermometerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 8f)
                curveTo(20.11f, 8f, 21f, 8.9f, 21f, 10f)
                verticalLineTo(16.76f)
                curveTo(21.61f, 17.31f, 22f, 18.11f, 22f, 19f)
                curveTo(22f, 20.66f, 20.66f, 22f, 19f, 22f)
                curveTo(17.34f, 22f, 16f, 20.66f, 16f, 19f)
                curveTo(16f, 18.11f, 16.39f, 17.31f, 17f, 16.76f)
                verticalLineTo(10f)
                curveTo(17f, 8.9f, 17.9f, 8f, 19f, 8f)
                moveTo(19f, 9f)
                curveTo(18.45f, 9f, 18f, 9.45f, 18f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                curveTo(20f, 9.45f, 19.55f, 9f, 19f, 9f)
                moveTo(12f, 5.69f)
                lineTo(7f, 10.19f)
                verticalLineTo(18f)
                horizontalLineTo(14.1f)
                lineTo(14f, 19f)
                lineTo(14.1f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                lineTo(12f, 3f)
                lineTo(16.4f, 6.96f)
                curveTo(15.89f, 7.4f, 15.5f, 7.97f, 15.25f, 8.61f)
                lineTo(12f, 5.69f)
                close()
            }
        }.build()

        return _HomeThermometerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HomeThermometerOutline: ImageVector? = null
