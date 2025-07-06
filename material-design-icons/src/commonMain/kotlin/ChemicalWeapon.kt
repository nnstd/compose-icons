package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChemicalWeapon: ImageVector
    get() {
        if (_ChemicalWeapon != null) {
            return _ChemicalWeapon!!
        }
        _ChemicalWeapon = ImageVector.Builder(
            name = "ChemicalWeapon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7.83f)
                curveTo(9.83f, 7.42f, 9f, 6.3f, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                curveTo(15f, 6.31f, 14.16f, 7.42f, 13f, 7.83f)
                verticalLineTo(10.64f)
                curveTo(12.68f, 10.55f, 12.35f, 10.5f, 12f, 10.5f)
                curveTo(11.65f, 10.5f, 11.32f, 10.55f, 11f, 10.64f)
                verticalLineTo(7.83f)
                moveTo(18.3f, 21.1f)
                curveTo(17.16f, 20.45f, 16.62f, 19.18f, 16.84f, 17.96f)
                lineTo(14.4f, 16.55f)
                curveTo(14.88f, 16.09f, 15.24f, 15.5f, 15.4f, 14.82f)
                lineTo(17.84f, 16.23f)
                curveTo(18.78f, 15.42f, 20.16f, 15.26f, 21.29f, 15.91f)
                curveTo(22.73f, 16.74f, 23.22f, 18.57f, 22.39f, 20f)
                curveTo(21.56f, 21.44f, 19.73f, 21.93f, 18.3f, 21.1f)
                moveTo(2.7f, 15.9f)
                curveTo(3.83f, 15.25f, 5.21f, 15.42f, 6.15f, 16.22f)
                lineTo(8.6f, 14.81f)
                curveTo(8.76f, 15.5f, 9.11f, 16.08f, 9.6f, 16.54f)
                lineTo(7.15f, 17.95f)
                curveTo(7.38f, 19.17f, 6.83f, 20.45f, 5.7f, 21.1f)
                curveTo(4.26f, 21.93f, 2.43f, 21.44f, 1.6f, 20f)
                curveTo(0.77f, 18.57f, 1.26f, 16.73f, 2.7f, 15.9f)
                moveTo(14f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                curveTo(10.89f, 16f, 10f, 15.1f, 10f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                curveTo(13.11f, 12f, 14f, 12.9f, 14f, 14f)
                moveTo(17f, 14f)
                lineTo(16.97f, 14.57f)
                lineTo(15.5f, 13.71f)
                curveTo(15.4f, 12.64f, 14.83f, 11.71f, 14f, 11.12f)
                verticalLineTo(9.41f)
                curveTo(15.77f, 10.19f, 17f, 11.95f, 17f, 14f)
                moveTo(14.97f, 18.03f)
                curveTo(14.14f, 18.64f, 13.11f, 19f, 12f, 19f)
                curveTo(10.89f, 19f, 9.86f, 18.64f, 9.03f, 18f)
                lineTo(10.5f, 17.17f)
                curveTo(10.96f, 17.38f, 11.47f, 17.5f, 12f, 17.5f)
                curveTo(12.53f, 17.5f, 13.03f, 17.38f, 13.5f, 17.17f)
                lineTo(14.97f, 18.03f)
                moveTo(7.03f, 14.56f)
                lineTo(7f, 14f)
                curveTo(7f, 11.95f, 8.23f, 10.19f, 10f, 9.42f)
                verticalLineTo(11.13f)
                curveTo(9.17f, 11.71f, 8.6f, 12.64f, 8.5f, 13.7f)
                lineTo(7.03f, 14.56f)
                close()
            }
        }.build()

        return _ChemicalWeapon!!
    }

@Suppress("ObjectPropertyName")
private var _ChemicalWeapon: ImageVector? = null
