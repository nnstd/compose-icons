package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PiggyBank: ImageVector
    get() {
        if (_PiggyBank != null) {
            return _PiggyBank!!
        }
        _PiggyBank = ImageVector.Builder(
            name = "PiggyBank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.83f, 7.5f)
                lineTo(17.56f, 5.23f)
                curveTo(17.63f, 4.81f, 17.74f, 4.42f, 17.88f, 4.08f)
                curveTo(17.96f, 3.9f, 18f, 3.71f, 18f, 3.5f)
                curveTo(18f, 2.67f, 17.33f, 2f, 16.5f, 2f)
                curveTo(14.86f, 2f, 13.41f, 2.79f, 12.5f, 4f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 4f, 2f, 6.46f, 2f, 9.5f)
                reflectiveCurveTo(4.5f, 21f, 4.5f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(21f)
                horizontalLineTo(17.5f)
                lineTo(19.18f, 15.41f)
                lineTo(22f, 14.47f)
                verticalLineTo(7.5f)
                horizontalLineTo(19.83f)
                moveTo(13f, 9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(16f, 11f)
                curveTo(15.45f, 11f, 15f, 10.55f, 15f, 10f)
                reflectiveCurveTo(15.45f, 9f, 16f, 9f)
                curveTo(16.55f, 9f, 17f, 9.45f, 17f, 10f)
                reflectiveCurveTo(16.55f, 11f, 16f, 11f)
                close()
            }
        }.build()

        return _PiggyBank!!
    }

@Suppress("ObjectPropertyName")
private var _PiggyBank: ImageVector? = null
