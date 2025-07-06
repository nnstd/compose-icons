package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dna: ImageVector
    get() {
        if (_Dna != null) {
            return _Dna!!
        }
        _Dna = ImageVector.Builder(
            name = "Dna",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                curveTo(6f, 5.44f, 6.68f, 6.61f, 7.88f, 7.78f)
                curveTo(8.74f, 8.61f, 9.89f, 9.41f, 11.09f, 10.2f)
                lineTo(9.26f, 11.39f)
                curveTo(8.27f, 10.72f, 7.31f, 10f, 6.5f, 9.21f)
                curveTo(5.07f, 7.82f, 4f, 6.1f, 4f, 4f)
                verticalLineTo(2f)
                moveTo(18f, 2f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                curveTo(20f, 6.1f, 18.93f, 7.82f, 17.5f, 9.21f)
                curveTo(16.09f, 10.59f, 14.29f, 11.73f, 12.54f, 12.84f)
                curveTo(10.79f, 13.96f, 9.09f, 15.05f, 7.88f, 16.22f)
                curveTo(6.68f, 17.39f, 6f, 18.56f, 6f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                curveTo(4f, 17.9f, 5.07f, 16.18f, 6.5f, 14.79f)
                curveTo(7.91f, 13.41f, 9.71f, 12.27f, 11.46f, 11.16f)
                curveTo(13.21f, 10.04f, 14.91f, 8.95f, 16.12f, 7.78f)
                curveTo(17.32f, 6.61f, 18f, 5.44f, 18f, 4f)
                verticalLineTo(2f)
                moveTo(14.74f, 12.61f)
                curveTo(15.73f, 13.28f, 16.69f, 14f, 17.5f, 14.79f)
                curveTo(18.93f, 16.18f, 20f, 17.9f, 20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                curveTo(18f, 18.56f, 17.32f, 17.39f, 16.12f, 16.22f)
                curveTo(15.26f, 15.39f, 14.11f, 14.59f, 12.91f, 13.8f)
                lineTo(14.74f, 12.61f)
                moveTo(7f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                lineTo(16.94f, 4.5f)
                horizontalLineTo(7.06f)
                lineTo(7f, 4f)
                verticalLineTo(3f)
                moveTo(7.68f, 6f)
                horizontalLineTo(16.32f)
                curveTo(16.08f, 6.34f, 15.8f, 6.69f, 15.42f, 7.06f)
                lineTo(14.91f, 7.5f)
                horizontalLineTo(9.07f)
                lineTo(8.58f, 7.06f)
                curveTo(8.2f, 6.69f, 7.92f, 6.34f, 7.68f, 6f)
                moveTo(9.09f, 16.5f)
                horizontalLineTo(14.93f)
                lineTo(15.42f, 16.94f)
                curveTo(15.8f, 17.31f, 16.08f, 17.66f, 16.32f, 18f)
                horizontalLineTo(7.68f)
                curveTo(7.92f, 17.66f, 8.2f, 17.31f, 8.58f, 16.94f)
                lineTo(9.09f, 16.5f)
                moveTo(7.06f, 19.5f)
                horizontalLineTo(16.94f)
                lineTo(17f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                lineTo(7.06f, 19.5f)
                close()
            }
        }.build()

        return _Dna!!
    }

@Suppress("ObjectPropertyName")
private var _Dna: ImageVector? = null
