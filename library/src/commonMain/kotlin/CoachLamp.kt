package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CoachLamp: ImageVector
    get() {
        if (_CoachLamp != null) {
            return _CoachLamp!!
        }
        _CoachLamp = ImageVector.Builder(
            name = "CoachLamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                lineTo(15f, 2f)
                horizontalLineTo(13f)
                lineTo(12f, 5f)
                lineTo(6f, 8f)
                horizontalLineTo(8f)
                lineTo(8.6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                lineTo(10f, 18f)
                lineTo(12f, 20f)
                lineTo(13f, 22f)
                horizontalLineTo(15f)
                lineTo(16f, 20f)
                lineTo(18f, 18f)
                lineTo(20f, 8f)
                horizontalLineTo(22f)
                moveTo(16.16f, 17f)
                horizontalLineTo(11.84f)
                lineTo(10f, 8f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _CoachLamp!!
    }

@Suppress("ObjectPropertyName")
private var _CoachLamp: ImageVector? = null
