package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Atom: ImageVector
    get() {
        if (_Atom != null) {
            return _Atom!!
        }
        _Atom = ImageVector.Builder(
            name = "Atom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                moveTo(4.22f, 4.22f)
                curveTo(5.65f, 2.79f, 8.75f, 3.43f, 12f, 5.56f)
                curveTo(15.25f, 3.43f, 18.35f, 2.79f, 19.78f, 4.22f)
                curveTo(21.21f, 5.65f, 20.57f, 8.75f, 18.44f, 12f)
                curveTo(20.57f, 15.25f, 21.21f, 18.35f, 19.78f, 19.78f)
                curveTo(18.35f, 21.21f, 15.25f, 20.57f, 12f, 18.44f)
                curveTo(8.75f, 20.57f, 5.65f, 21.21f, 4.22f, 19.78f)
                curveTo(2.79f, 18.35f, 3.43f, 15.25f, 5.56f, 12f)
                curveTo(3.43f, 8.75f, 2.79f, 5.65f, 4.22f, 4.22f)
                moveTo(15.54f, 8.46f)
                curveTo(16.15f, 9.08f, 16.71f, 9.71f, 17.23f, 10.34f)
                curveTo(18.61f, 8.21f, 19.11f, 6.38f, 18.36f, 5.64f)
                curveTo(17.62f, 4.89f, 15.79f, 5.39f, 13.66f, 6.77f)
                curveTo(14.29f, 7.29f, 14.92f, 7.85f, 15.54f, 8.46f)
                moveTo(8.46f, 15.54f)
                curveTo(7.85f, 14.92f, 7.29f, 14.29f, 6.77f, 13.66f)
                curveTo(5.39f, 15.79f, 4.89f, 17.62f, 5.64f, 18.36f)
                curveTo(6.38f, 19.11f, 8.21f, 18.61f, 10.34f, 17.23f)
                curveTo(9.71f, 16.71f, 9.08f, 16.15f, 8.46f, 15.54f)
                moveTo(5.64f, 5.64f)
                curveTo(4.89f, 6.38f, 5.39f, 8.21f, 6.77f, 10.34f)
                curveTo(7.29f, 9.71f, 7.85f, 9.08f, 8.46f, 8.46f)
                curveTo(9.08f, 7.85f, 9.71f, 7.29f, 10.34f, 6.77f)
                curveTo(8.21f, 5.39f, 6.38f, 4.89f, 5.64f, 5.64f)
                moveTo(9.88f, 14.12f)
                curveTo(10.58f, 14.82f, 11.3f, 15.46f, 12f, 16.03f)
                curveTo(12.7f, 15.46f, 13.42f, 14.82f, 14.12f, 14.12f)
                curveTo(14.82f, 13.42f, 15.46f, 12.7f, 16.03f, 12f)
                curveTo(15.46f, 11.3f, 14.82f, 10.58f, 14.12f, 9.88f)
                curveTo(13.42f, 9.18f, 12.7f, 8.54f, 12f, 7.97f)
                curveTo(11.3f, 8.54f, 10.58f, 9.18f, 9.88f, 9.88f)
                curveTo(9.18f, 10.58f, 8.54f, 11.3f, 7.97f, 12f)
                curveTo(8.54f, 12.7f, 9.18f, 13.42f, 9.88f, 14.12f)
                moveTo(18.36f, 18.36f)
                curveTo(19.11f, 17.62f, 18.61f, 15.79f, 17.23f, 13.66f)
                curveTo(16.71f, 14.29f, 16.15f, 14.92f, 15.54f, 15.54f)
                curveTo(14.92f, 16.15f, 14.29f, 16.71f, 13.66f, 17.23f)
                curveTo(15.79f, 18.61f, 17.62f, 19.11f, 18.36f, 18.36f)
                close()
            }
        }.build()

        return _Atom!!
    }

@Suppress("ObjectPropertyName")
private var _Atom: ImageVector? = null
