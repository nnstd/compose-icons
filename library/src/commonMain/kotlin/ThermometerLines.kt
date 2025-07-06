package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThermometerLines: ImageVector
    get() {
        if (_ThermometerLines != null) {
            return _ThermometerLines!!
        }
        _ThermometerLines = ImageVector.Builder(
            name = "ThermometerLines",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(17f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                moveTo(17f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(17.75f)
                lineTo(17f, 12.1f)
                verticalLineTo(11f)
                moveTo(21f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                curveTo(19f, 16.31f, 18.9f, 15.63f, 18.71f, 15f)
                horizontalLineTo(21f)
                moveTo(7f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                moveTo(7f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(7f, 11f)
                verticalLineTo(12.1f)
                lineTo(6.25f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(3f, 15f)
                horizontalLineTo(5.29f)
                curveTo(5.1f, 15.63f, 5f, 16.31f, 5f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(15f, 13f)
                verticalLineTo(5f)
                curveTo(15f, 3.34f, 13.66f, 2f, 12f, 2f)
                reflectiveCurveTo(9f, 3.34f, 9f, 5f)
                verticalLineTo(13f)
                curveTo(6.79f, 14.66f, 6.34f, 17.79f, 8f, 20f)
                reflectiveCurveTo(12.79f, 22.66f, 15f, 21f)
                reflectiveCurveTo(17.66f, 16.21f, 16f, 14f)
                curveTo(15.72f, 13.62f, 15.38f, 13.28f, 15f, 13f)
                moveTo(12f, 4f)
                curveTo(12.55f, 4f, 13f, 4.45f, 13f, 5f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                curveTo(11f, 4.45f, 11.45f, 4f, 12f, 4f)
                close()
            }
        }.build()

        return _ThermometerLines!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerLines: ImageVector? = null
