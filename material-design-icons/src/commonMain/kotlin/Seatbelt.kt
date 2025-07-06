package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Seatbelt: ImageVector
    get() {
        if (_Seatbelt != null) {
            return _Seatbelt!!
        }
        _Seatbelt = ImageVector.Builder(
            name = "Seatbelt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.11f, 2f, 14f, 2.9f, 14f, 4f)
                curveTo(14f, 5.11f, 13.11f, 6f, 12f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12.39f, 14.79f)
                curveTo(14.03f, 14.79f, 15.46f, 14.89f, 16.64f, 15.04f)
                curveTo(16.7f, 12.32f, 16.46f, 9.92f, 16f, 9f)
                curveTo(15.87f, 8.73f, 15.69f, 8.5f, 15.5f, 8.3f)
                lineTo(7.43f, 15.22f)
                curveTo(8.79f, 15f, 10.5f, 14.79f, 12.39f, 14.79f)
                moveTo(7.46f, 17f)
                curveTo(7.59f, 18.74f, 7.85f, 20.5f, 8.27f, 22f)
                horizontalLineTo(10.34f)
                curveTo(10.05f, 21.12f, 9.84f, 20.09f, 9.68f, 19f)
                curveTo(9.68f, 19f, 12f, 18.56f, 14.32f, 19f)
                curveTo(14.16f, 20.09f, 13.95f, 21.12f, 13.66f, 22f)
                horizontalLineTo(15.73f)
                curveTo(16.17f, 20.45f, 16.43f, 18.61f, 16.56f, 16.79f)
                curveTo(15.41f, 16.65f, 14f, 16.54f, 12.39f, 16.54f)
                curveTo(10.46f, 16.54f, 8.78f, 16.75f, 7.46f, 17f)
                moveTo(12f, 7f)
                curveTo(12f, 7f, 9f, 7f, 8f, 9f)
                curveTo(7.66f, 9.68f, 7.44f, 11.15f, 7.37f, 12.96f)
                lineTo(13.92f, 7.34f)
                curveTo(12.93f, 7f, 12f, 7f, 12f, 7f)
                moveTo(18.57f, 5.67f)
                lineTo(17.43f, 4.34f)
                lineTo(13.92f, 7.35f)
                curveTo(14.47f, 7.54f, 15.05f, 7.84f, 15.5f, 8.3f)
                lineTo(18.57f, 5.67f)
                moveTo(20.67f, 15.83f)
                curveTo(20.58f, 15.8f, 19.14f, 15.33f, 16.64f, 15.04f)
                curveTo(16.63f, 15.61f, 16.6f, 16.2f, 16.56f, 16.79f)
                curveTo(18.81f, 17.07f, 20.1f, 17.5f, 20.12f, 17.5f)
                lineTo(20.67f, 15.83f)
                moveTo(7.37f, 12.96f)
                lineTo(3.43f, 16.34f)
                lineTo(4.32f, 17.82f)
                curveTo(4.34f, 17.81f, 5.5f, 17.36f, 7.46f, 17f)
                curveTo(7.35f, 15.59f, 7.32f, 14.2f, 7.37f, 12.96f)
                close()
            }
        }.build()

        return _Seatbelt!!
    }

@Suppress("ObjectPropertyName")
private var _Seatbelt: ImageVector? = null
