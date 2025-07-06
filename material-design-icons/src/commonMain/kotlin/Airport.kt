package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Airport: ImageVector
    get() {
        if (_Airport != null) {
            return _Airport!!
        }
        _Airport = ImageVector.Builder(
            name = "Airport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.97f, 5.92f)
                curveTo(14.83f, 5.41f, 14.3f, 5.1f, 13.79f, 5.24f)
                lineTo(10.39f, 6.15f)
                lineTo(5.95f, 2.03f)
                lineTo(4.72f, 2.36f)
                lineTo(7.38f, 6.95f)
                lineTo(4.19f, 7.8f)
                lineTo(2.93f, 6.82f)
                lineTo(2f, 7.07f)
                lineTo(3.66f, 9.95f)
                lineTo(14.28f, 7.11f)
                curveTo(14.8f, 6.96f, 15.1f, 6.43f, 14.97f, 5.92f)
                moveTo(21f, 10f)
                lineTo(20f, 12f)
                horizontalLineTo(15f)
                lineTo(14f, 10f)
                lineTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                lineTo(21f, 10f)
                moveTo(22f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _Airport!!
    }

@Suppress("ObjectPropertyName")
private var _Airport: ImageVector? = null
