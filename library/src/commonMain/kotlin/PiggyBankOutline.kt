package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PiggyBankOutline: ImageVector
    get() {
        if (_PiggyBankOutline != null) {
            return _PiggyBankOutline!!
        }
        _PiggyBankOutline = ImageVector.Builder(
            name = "PiggyBankOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                curveTo(15f, 9.45f, 15.45f, 9f, 16f, 9f)
                curveTo(16.55f, 9f, 17f, 9.45f, 17f, 10f)
                reflectiveCurveTo(16.55f, 11f, 16f, 11f)
                reflectiveCurveTo(15f, 10.55f, 15f, 10f)
                moveTo(8f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(22f, 7.5f)
                verticalLineTo(14.47f)
                lineTo(19.18f, 15.41f)
                lineTo(17.5f, 21f)
                horizontalLineTo(12f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 21f, 2f, 12.54f, 2f, 9.5f)
                reflectiveCurveTo(4.46f, 4f, 7.5f, 4f)
                horizontalLineTo(12.5f)
                curveTo(13.41f, 2.79f, 14.86f, 2f, 16.5f, 2f)
                curveTo(17.33f, 2f, 18f, 2.67f, 18f, 3.5f)
                curveTo(18f, 3.71f, 17.96f, 3.9f, 17.88f, 4.08f)
                curveTo(17.74f, 4.42f, 17.62f, 4.81f, 17.56f, 5.23f)
                lineTo(19.83f, 7.5f)
                horizontalLineTo(22f)
                moveTo(20f, 9.5f)
                horizontalLineTo(19f)
                lineTo(15.5f, 6f)
                curveTo(15.5f, 5.35f, 15.59f, 4.71f, 15.76f, 4.09f)
                curveTo(14.79f, 4.34f, 14f, 5.06f, 13.67f, 6f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 6f, 4f, 7.57f, 4f, 9.5f)
                curveTo(4f, 11.38f, 5.22f, 16.15f, 6f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                lineTo(17.56f, 13.85f)
                lineTo(20f, 13.03f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _PiggyBankOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PiggyBankOutline: ImageVector? = null
